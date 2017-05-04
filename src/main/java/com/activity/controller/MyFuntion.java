package com.activity.controller;

import java.util.List;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class MyFuntion {

	    @Test
	    public void createTable() {  
	        ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration  
	                .createStandaloneProcessEngineConfiguration();  
	        //连接数据库的配置  
	        //配置数据库驱动:对应不同数据库类型的驱动  
	        processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");  
	        //配置数据库的JDBC URL  
	        processEngineConfiguration.setJdbcUrl("jdbc:mysql://localhost:3306/activity?useUnicode=true&characterEncoding=utf8");  
	        //配置连接数据库的用户名  
	        processEngineConfiguration.setJdbcUsername("root");  
	        //配置连接数据库的密码  
	        processEngineConfiguration.setJdbcPassword("2016");  
	        /** 
	            public static final String DB_SCHEMA_UPDATE_FALSE = "false";不能自动创建表，需要表存在 
	            public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";先删除表再创建表 
	            public static final String DB_SCHEMA_UPDATE_TRUE = "true";如果表不存在，自动创建表 
	      */  
	        processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);  
	        //工作流的核心对象，ProcessEnginee对象  
	        ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();  
	        System.out.println("processEngine:"+processEngine);  
	    }  
	 
}
