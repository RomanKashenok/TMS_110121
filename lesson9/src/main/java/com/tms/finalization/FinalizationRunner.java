package com.tms.finalization;

import java.util.ArrayList;
import java.util.List;

public class FinalizationRunner
{

    public final static List<SimpleObject> objList = new ArrayList<>();

	public static void main(String[] args)
	{
		List<SimpleObject> soList  = new ArrayList<>();

		for (int i = 0; i < 2500000; i++)
		{
//			createObject(i);
//			soList.add(createObject(i));
		}

        System.out.println("******************** Size of my list: " + soList.size());
	}

	private static SimpleObject createObject(int number)
	{
		return new SimpleObject("so" + number);
	}
}
