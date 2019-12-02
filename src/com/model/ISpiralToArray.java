package com.model;

import java.util.List;

public interface ISpiralToArray {
    Pixel[][] GetArray();
    void SetSpecialNumbers(List<Integer> list);
    List<Integer> GetSpecialNumbers();
}
