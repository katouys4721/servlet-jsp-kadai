package forms;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfirmServlet extends HttpServlet {
//	送信ボタンが押されたときのPOSTに対応
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
//		リクエスト・レスポンスの設定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
//		JSPからのリクエストデータ取得
		String userName = request.getParameter("name");
		String userEmail = request.getParameter("email");
		String userAddress = request.getParameter("address");
		String userPhoneNumber = request.getParameter("phone_number");
		
//		リクエストスコープにデータ保存
		request.setAttribute("name", userName);
		request.setAttribute("email", userEmail);
		request.setAttribute("address", userAddress);
		request.setAttribute("phone_number", userPhoneNumber);
		
//		フォワードで画面遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/confirmPage.jsp");
		dispatcher.forward(request, response);
	}
}
