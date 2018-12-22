package com.bs.admin.mapper;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Supplier;

/**  

* <p>Title: SupplierMapper</p>  

* <p>Description: 3+4 </p>  

* @author 王顺坤  

* <p> @date 2018年12月2日</p>   

*/ 
public interface SupplierMapper {

	/**  
	
	 * <p>Title: insertSupplier</p>  
	
	 * <p>Description: 添加一个供应商，其中	name 不能为空 </p>  
	
	 * @param supplier
	 * @return  添加的行数
	 * <p> @date 2018年11月30日  </p> 
	 */
	Integer insertSupplier(Supplier supplier);

	/**  
	
	 * <p>Title: deleteSupplierById</p>  
	
	 * <p>Description: 通过id值删除供应商</p>  
	
	 * @param supplierId
	 * @return  
	 * <p> @date 2018年11月30日  </p> 
	 */
	Integer deleteSupplierById(@Param("supplierId") Integer supplierId);

	/**  
	
	 * <p>Title: updateSupplierById</p>  
	
	 * <p>Description: 通过id更改其他字段 </p>  
	
	 * @param supplier
	 * @return   修改的行数
	 * <p> @date 2018年11月30日  </p> 
	 */
	Integer updateSupplierById(Supplier supplier);

	/**  
	
	 * <p>Title: dynamicSelect</p>  
	
	 * <p>Description: 动态查询supplier  supplier 不可以为空</p>  
	
	 * @param supplier 一个supplier 对象，其中合作日期没用
	 * @param startDate	查询条件的起始日期
	 * @param endDate   查询条件的结束日期
	 * @return  
	 * <p> @date 2018年11月30日  </p> 
	 */
	List<Supplier> dynamicSelect(@Param("supplier") Supplier supplier, 
			@Param("startDate") String startDate,
			@Param("endDate") String endDate);

	/**  
	
	 * <p>Title: selectSupplierAll</p>  
	
	 * <p>Description: 查询所有的supplier数据</p>  
	
	 * @return   查询到的清单
	 * <p> @date 2018年11月30日  </p> 
	 */
	List<Supplier> selectSupplierAll();

	/**  
	
	 * <p>Title: selectCooperateCount</p>  
	
	 * <p>Description: </p>  
	
	 * @param supplier
	 * @return  
	 * <p> @date 2018年11月30日  </p> 
	 */
	Integer selectCooperateCountById(@Param("supplierId") Integer supplierId);

	/**  
	
	 * <p>Title: selectBySupplierId</p>  
	
	 * <p>Description: 查询指定id的供应商信息</p>  
	
	 * @param supplierId
	 * @return   指定id的供应商信息
	 * <p> @date 2018年11月30日  </p> 
	 */
	Supplier selectBySupplierId(@Param("supplierId") Integer supplierId);


}
