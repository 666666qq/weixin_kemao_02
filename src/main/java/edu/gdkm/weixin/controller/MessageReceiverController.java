package edu.gdkm.weixin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//是满足他风格的一种控制器
@RestController

@RequestMapping("kemao_02chenzhipeng/message/receiver")
public class MessageReceiverController {
	
	private static final Logger LOG =LoggerFactory.getLogger(MessageReceiverController.class);
	
	
	@GetMapping
	public String echo(//
	@RequestParam("signature") String signature,//
	@RequestParam("timestamp") String timestamp,//
	@RequestParam("nonce") String nonce,//
	@RequestParam("echostr") String echostr//
	
		){
		
	

		return echostr;
	}
	@PostMapping
	public String onMessage(@RequestBody String xml) {
		//收到消息
		LOG.trace("收到的消息原文:\n{}\n",xml);
		return "success";
		
		
	}
}

