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
	        //�������ݿ������  
	        //�������ݿ�����:��Ӧ��ͬ���ݿ����͵�����  
	        processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");  
	        //�������ݿ��JDBC URL  
	        processEngineConfiguration.setJdbcUrl("jdbc:mysql://localhost:3306/activity?useUnicode=true&characterEncoding=utf8");  
	        //�����������ݿ���û���  
	        processEngineConfiguration.setJdbcUsername("root");  
	        //�����������ݿ������  
	        processEngineConfiguration.setJdbcPassword("2016");  
	        /** 
	            public static final String DB_SCHEMA_UPDATE_FALSE = "false";�����Զ���������Ҫ����� 
	            public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";��ɾ�����ٴ����� 
	            public static final String DB_SCHEMA_UPDATE_TRUE = "true";��������ڣ��Զ������� 
	      */  
	        processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);  
	        //�������ĺ��Ķ���ProcessEnginee����  
	        ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();  
	        System.out.println("processEngine:"+processEngine);  
	    }  
	 
}
