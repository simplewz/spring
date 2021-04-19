package org.simple.spring.webflux.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestReactor {

    public static void main(String[] args) {
        //just方法直接声明
        Flux.just(1,2,3,4).subscribe(System.out::println);
        Mono.just(1).subscribe(System.out::println);

        //数组
        Integer[] array=new Integer[]{1,2,3,4};
        Flux.fromArray(array);

        //集合
        List<Integer> list= Arrays.asList(array);
        Flux.fromIterable(list);

        //stream流
        Stream<Integer> stream=list.stream();
        Flux.fromStream(stream);
    }

}
