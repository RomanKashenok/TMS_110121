package com.tms.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RunnerWithException
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("exceptionalfile.file");
		}
		catch (FileNotFoundException | IndexOutOfBoundsException exception) {
			try
			{
				throw new FileBadNameOrAbsentException("Наверное вы ошиблися");
			}
			catch (FileBadNameOrAbsentException e)
			{
				e.printStackTrace();
			}
		}

		System.out.println("File was found or not!");

	}
}
