package com.lxitedu.model.util;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;



public class IbatisUtil {
	private static SqlMapClient sqlMap;

    public static SqlMapClient getSqlMap() {
    	 String resource = "com/lxitedu/model/dao/data/sqlMapConfig.xml";
         Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return sqlMap;
    }
}
