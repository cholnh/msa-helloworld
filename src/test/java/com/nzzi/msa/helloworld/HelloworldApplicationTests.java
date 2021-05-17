package com.nzzi.msa.helloworld;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloworldApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    @DisplayName("성공하는 테스트 실행")
    void succeed_test() {
        assertEquals(2, 1 + 1);
    }

}
