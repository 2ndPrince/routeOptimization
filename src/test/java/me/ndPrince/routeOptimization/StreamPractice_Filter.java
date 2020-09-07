package me.ndPrince.routeOptimization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class StreamPractice_Filter {

    @Test
    public void stream_filter_one() {
        List<Integer> integers = Arrays.asList(5, 3, 2, 9, 10);
        List<Integer> collect = integers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        assertTrue(collect.contains(Integer.valueOf(2)));
        assertTrue(collect.contains(Integer.valueOf(10)));
        assertFalse(collect.contains(Integer.valueOf(9)));
        assertEquals(2, collect.size());
    }

    @Test
    public void stream_filter_two() {
        List<String> strings = Arrays.asList("strawberry", "melon", "apple", "banana", "fruit");
        List<String> collect = strings.stream().filter(s -> s.length() == 5).collect(Collectors.toList());

        assertTrue(collect.contains("melon"));
        assertTrue(collect.contains("apple"));
        assertTrue(collect.contains("fruit"));
        assertEquals(3, collect.size());
    }

    @Test
    public void stream_filter_three() {
        List<String> strings = Arrays.asList("strawberry", "melon", "apple", "banana", "fruit");
        List temp = new ArrayList();
        strings.stream().filter(s -> startWith_sma(s)).collect(Collectors.toList()).forEach(l -> {
            String s = l.toUpperCase();
            temp.add(s);
            System.out.println(s);
        });
        assertEquals(3, temp.size());
        assertTrue(temp.contains("MELON"));
    }

    private boolean startWith_sma(String s) {
        boolean s1 = s.startsWith("s");
        boolean s2 = s.startsWith("m");
        boolean s3 = s.startsWith("a");

        return (s1 || s2 || s3);
    }
}
