package com.human.dalligo.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class RRenrollVO {

	private Integer enrollId;
	private String userId;
	private Integer courseId;
	private LocalDateTime enrollDate;
}
