package com.bs.admin.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Control;
import com.bs.admin.pojo.Permission;

/**
 * 
 * <p>
 * Title: BookInterceptor
 * </p>
 * <p>
 * Description: 拦截器
 * </p>
 * 
 * @author 胡杰
 * @date 2018年11月23日
 */
public class BookInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// 设置所有页面不缓存
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", -1);
		// 获取访问路径
		String servletPath = request.getServletPath();
		request.setCharacterEncoding("utf-8");
//		System.out.println("访问路径 ：" + servletPath);
		// 未登录时，可以访问登录页面的资源（页面、js、css、图片等）
		if (servletPath.contains("login")
				|| servletPath.contains("images") 
				|| servletPath.contains("blankPage")
				|| servletPath.contains("js") 
				|| servletPath.contains("css") 
				|| servletPath.contains("jquery-easyui")) {
			return true;
		}
		// 如果已经登录过
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (null != admin) {
			// System.out.println("已经登录过");
			/**
			 * 匹配管理员所代表的角色拥有的controller权限，控制url访问。管理员从地址栏输入url后，拦截器获取url访问路径，遍历管理员所关联的controller权限与之匹配。如果遍历后仍然没有匹配成功，则说明是无权访问
			 */
			// 只要已经登录，个人中心页面、上传下载页面放行
			if (servletPath.contains("mypage") 
					|| servletPath.contains("myLog") 
					|| servletPath.contains("download")
					|| servletPath.contains("upload")
					|| servletPath.contains("getMyLog"))
				
				return true;
			List<Permission> permissions = admin.getPermissions();
			for (Permission permission : permissions) {
				// 如果管理员代表的角色所拥有的controller访问路径中包含当前路径，放行
				for (Control control : permission.getControls()) {
					if (servletPath.contains(control.getControlMapping()))
						return true;
				}
			}
			request.getSession().setAttribute("message", "权限不匹配，无法越权访问");
			response.sendRedirect(request.getContextPath().concat("/blank.jsp"));
			return false;
		}

		// 其他非法访问，需要登录。重定向到登陆页面
//		System.out.println("非法访问");
		request.getSession().setAttribute("message", "未登录，请先登录~");
		response.sendRedirect(request.getContextPath().concat("/blank.jsp"));
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
