package com.demo.learning.plmxml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class plmXmlHandler extends DefaultHandler {
	
	 private List<Employee> empList = new ArrayList<Employee>();
	 private Employee emp = null;
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	     
//		 if (qName.equalsIgnoreCase("Employee")) {
//	            emp = new Employee();
//	            emp.setId(attributes.getValue("id"));  // Read the 'id' attribute
//	        }
	}
	
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
	}

}
