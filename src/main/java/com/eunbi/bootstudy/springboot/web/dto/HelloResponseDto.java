package com.eunbi.bootstudy.springboot.web.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
