package com.pegination.pegination.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;

import java.util.Objects;

@Getter
@Setter
public class PageRequestDto {
    private Integer pageNo= 0;

    private Integer pageSize = 10;

    public PageRequest getPageable(PageRequestDto dto){
        Integer page =Objects.nonNull(dto.getPageNo()) ? dto.pageNo:this.pageNo;
        Integer size =Objects.nonNull(dto.getPageSize()) ? dto.pageSize:this.pageSize;

       PageRequest pageRequest= PageRequest.of(page, size);

        return pageRequest;

    }
}
