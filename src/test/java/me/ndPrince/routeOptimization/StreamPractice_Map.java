package me.ndPrince.routeOptimization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class StreamPractice_Map {

    @Test
    public void stream_map_one() {
        List<Integer> integers = Arrays.asList(5, 3, 2, 9, 10);
        List<Integer> collect = integers.stream().map(n -> n * n).collect(Collectors.toList());

        assertTrue(collect.contains(Integer.valueOf(25)));
        assertTrue(collect.contains(Integer.valueOf(9)));
        assertFalse(collect.contains(Integer.valueOf(10)));
        assertEquals(5, collect.size());

    }

    @Test
    public void stream_map_two() {
        List<String> strings = Arrays.asList("strawberry", "melon", "apple", "banana", "fruit");
        List<Integer> collect = strings.stream().map(s -> sumStringAsChar(s)).collect(Collectors.toList());
        assertEquals(sumStringAsChar("strawberry"), collect.get(0).intValue());
    }

    @Test
    public void stream_sorted_one() {
        List<String> strings = Arrays.asList("strawberry", "melon", "apple", "banana", "fruit", "pineapple");
        List<Integer> collect_asc = strings.stream().map(s -> sumStringAsChar(s)).sorted().collect(Collectors.toList());
        List<Integer> collect_desc = strings.stream().map(s -> sumStringAsChar(s)).sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        assertTrue(collect_asc.get(0).equals(collect_desc.get(collect_desc.size() - 1)));
        System.out.println(collect_asc.toString());
        System.out.println(collect_desc.toString());
    }

    private int sumStringAsChar(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + s.charAt(i);
        }
        return sum;
    }
}
