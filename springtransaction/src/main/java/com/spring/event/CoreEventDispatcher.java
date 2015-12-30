/**
 * gomeo2o.com 
 * Copyright (c) 2015-2025 All Rights Reserved.
 * @Description TODO 
 * @author kl_chaizhilei
 * @date 2015年12月30日 下午3:10:30
 */
package com.spring.event;

import java.util.Map;
import java.util.concurrent.Executors;

import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

/**
 * @Description 核心事件分发
 * @author kl_chaizhilei
 * @date 2015年12月30日 下午3:10:30
 */
@Slf4j
public class CoreEventDispatcher {
	
	protected final EventBus eventBus;

	@Autowired
	private ApplicationContext applicationContext;

	public CoreEventDispatcher() {
		this(Runtime.getRuntime().availableProcessors() + 1);
	}

	public CoreEventDispatcher(Integer threadCount) {
		eventBus = new AsyncEventBus(Executors.newFixedThreadPool(threadCount));
	}

	@PostConstruct
	public void registerListeners() {
		Map<String, EventListener> listeners = applicationContext.getBeansOfType(EventListener.class);
		for (EventListener eventListener : listeners.values()) {
			eventBus.register(eventListener);
		}
	}

	/**
	 * 发布事件
	 */
	public void publish(Object event) {
		log.info("publish an event({})", event);
		eventBus.post(event);
	}

}
