package com.lql;

import com.lql.service.dao.User;
import org.junit.jupiter.api.Test;

/**
 * @author liqiuliang
 * @create 2023-09-07 11:38
 */
public class BuilderTest {
    @Test
    public void testBuilder() {
        User user = User.builder().userId(100L).phone("110").build();
    }
}
