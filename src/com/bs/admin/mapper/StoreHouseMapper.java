package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.StoreHouse;

public interface StoreHouseMapper {

	/**
	 * 
	 * <p>
	 * Title: dynamicSelect
	 * </p>
	 * 
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param storeHouseId
	 * @param storeHouseName
	 * @param storeHousAddress
	 * @return
	 *         <p>
	 * 		@date 2018年12月17日
	 *         </p>
	 */
	List<StoreHouse> dynamicSelect(@Param("storeHouseId") Integer storeHouseId,
			@Param("storeHouseName") String storeHouseName, @Param("storeHouseAddress") String storeHouseAddress);

	/**  
	
	 * <p>Title: selectById</p>  
	
	 * <p>Description: 通过id查询 </p>  
	
	 * @param storeHouseId
	 * @return  
	 * <p> @date 2018年12月18日  </p> 
	 */
	StoreHouse selectById(Integer storeHouseId);
}
