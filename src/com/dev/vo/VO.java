package com.dev.vo;

public class VO {

	public String id;
	public String title;
	private int count;
	
	public VO() {}	
	public VO(String tId, String tTitle)
	{
		this.id = tId;
		this.title = tTitle;
		this.count = 0;
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String tId)
	{
		this.id = tId;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String tTitle)
	{
		this.title = tTitle;
	}
	public int getCount()
	{
		return count;
	}
	public void setCount(int tCount)
	{
		this.count = tCount;
	}
}
