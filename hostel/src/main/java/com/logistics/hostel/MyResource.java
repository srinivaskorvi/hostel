package com.logistics.hostel;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.ibatis.session.SqlSession;

import com.logistics.core.MyBatisUtil;
import com.logistics.dao.AmenitiesMapper;
import com.logistics.model.Amenities;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Amenities> getIt() {
    	
    	SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
    	
    	try {
    	
    		AmenitiesMapper mapper = session.getMapper(AmenitiesMapper.class);
    		List<Amenities> amenities = mapper.selectByExample(null);
    		
    		return amenities;
    		
    	} finally {
    		session.close();
    	}
    }
}
