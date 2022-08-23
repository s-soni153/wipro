package com.wipro.doconnect.vo;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
	@NotBlank(message = "provide the user Details")
	private String fromUser;
	@NotBlank(message = "provide message")
	private String message;

}
