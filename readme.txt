1、tomcat服务器的安装和配置、http协议
	1.1  虚似目录的映射（server.xml  catalina\localhost\）
	1.2  虚似主机的配置
	1.3  http协议的请求和响应的各个组成部分
		1.3.1  各个常见请求头的含议
		1.3.2  各个常响应头的含义。

2.servlet开发
	2.1 servlet的开发7个细节性的问题
	2.2 servletConfig
	2.3 servletCOntext对象
		2.3.1 域对象
		2.3.2 读取资源文件（读取资源文件的三种方式）：
			1 servletContext
			2 ClassLoader
			3 FileInputStream
		2.3.3  转发  this.getServletContext.getRequestDispatcher()

3.request和response的使用
	response
	3.1 一个http响应包含响应状态行、响应头、响应数据，要掌握通过response发送这三部分内容
	3.2 response发送中文
	3.3 response发送动态图片
	3.4 response实现下载
	3.5 response实现请求重定向
	3.6 meta标签模似http响应头

	request
	3.1 一个http请求包含请求行、请求头、请求数据，要掌握通过request获取这三部分内容
	3.2 使用request获取中文数据的问题(get\post)
	3.3 使用request获取各种不同类型的表单数据（text\checkbox\radio）
	3.4 域对象
	3.5 实现请求转发

4、session和cookie(会话过程中多个web组件数据共享问题)
	cookie：把数据打给客户机
	1.显示用户上次访问时间
	2.用户上次浏览过的商品
	
	session:把数据存在服务器的session对象中
	1.购物案例
		1.1 如何实现关掉浏览器后，session还能为用户服务（一个session为多个窗口服务）。
		1.2 如何实现用户禁用cookie后，还能实现购物（URL重写）
	2.用户登陆
	3.防表单重复提交
		3.1 md5\base64
	
5、jsp
	1 9大内置对象
	2 jsp常用的标签
	3 el表达式和jstl标签库

6、javabean开发和案例
	1  jsp+javabean(简单的计算器)
	2  jsp+servlet+javabean(MVC) 软件的分层思想
	3  用户注册和登陆案例
	4  购物车的案例

7、自定义标签
	1、传统标签（了解）
		tag:(是否执行标签体，以及标签余下的jsp)	
		IterationTag:(迭代标签体)
		bodyTag:(修改标签体)
	
	2、简单标签（掌握）
		SimpleTag  (可以替换上面的三个传统接口)

	3 标签应用（if,else,foreach.....）
	
	4. 标签属性

	5. 打包标签库

	6.exe文件

8、el + jstl + web国际化
	1.固定文本的国际化
		（properties文件，一组资源文件就是一个资源包，ResourceBundle.getBundle()）
	2.动态数据的国际化
		DateFormat:(日期国际化)
			format(Date date)---->符合国家地区习惯的字符串
			parse(String date)---->把字符串格成日期
	3.MessageFormat
		批量国际化（占位符）


9.mysql（表的设计）

10、jdbc开发（1）
	1.入门
	2.jdbc开发中涉及到的每一个对象的方法详解
		DriverManager
		Connection
		Statement(PreparedStatement)
		ResultSet
	3、用jdbc改造注册登陆案例
		DaoFactory
		DaoException
		sql注入的问题
	4.PreparedStatement（PreparedStatement和statement对象的区别）
	5、jdbc案例（客户关系）

11、jdbc开发（2）
	1.分页(Page)
	2.批处理
	3.大数据
	4.存储过程的调用
	5.获取自动增长的主键

11、jdbc开发（3）
	1.事务
		1.1 什么是事务  start transaction commit rollback;
		1.2 事务的四大特性：ACID
		1.3 四大隔离级别，以及隔离性会导致的一些问题：
			脏读：
			不可重复读，
			虚读：
		1.4 在jdbc程序中怎么控制多条sql作为整体执行，在jdbc程序中如何设置事务隔离级别

		1.5 连接池的实现原理
		1.6 常用的连接池产品：
			tomcat内置（DBCP,JNDI）
			DBCP
			C3P0

		1.7 元数据
		1.8 自已设计类似于DBUtils的框架

12、jdbc开发（4）
	1. DbUtils的使用（常用的几种处理器）
	2. 在实际开发中如何控制事务。（ThreadLocal***）
	3. jdbc多表操作（学hibernate基础）
		一对多（多对一）
		多对多
		一对一
	4. oracle的大数据




		

	
	






	
	
	