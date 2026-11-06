package com.company.employee.util;
import java.text.*;
import java.util.*;
public class Converter 
{
    public static Date stringToDateConverter(String stringDate) throws Exception
    {
        try
        {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Date date=simpleDateFormat.parse(stringDate);
        return date;
        }catch(ParseException p)
        {
            throw new Exception(p.getMessage());
        }
    }
}