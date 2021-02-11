package com.tms.comparision;

import java.util.Comparator;

/**
 * Created by Raman Kashanok
 */
public class NamesComparator implements Comparator<Human>
{

	@Override public int compare(Human o1, Human o2)
	{
		return o1.getName().length() - o2.getName().length();
	}
}
