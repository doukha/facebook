package com.tsaksia.facebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by samyboukhris on 24/05/2018.
 */
public class MainTestoo {

    @Test
    public void name() throws Exception {
        List<String> unmodifiableList = Collections.unmodifiableList(Arrays.asList("kjkj", "dff"));
        Assert.assertEquals(unmodifiableList.get(0), "kjkj");
        unmodifiableList.add("coucouc");
    }
}