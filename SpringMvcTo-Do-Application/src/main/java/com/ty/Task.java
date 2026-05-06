package com.ty;

import java.util.Objects;

public class Task {
	String title;
	String desc;
	
	public String getTitle() {
		return title;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(desc,title);
	}
	
	
	public Task(String title, String desc) {
		super();
		this.title = title;
		this.desc = desc;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(this==null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(desc,other.desc) && Objects.equals(title, other.title);
	}

}