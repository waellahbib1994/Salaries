package com.tsconsult.test.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageResponse {
	
	private boolean success;
	private String message;
	
}
