package ex1_variable;

/*
 * 1. �옄諛� �씠由� 洹쒖튃
 *    1) �뙣�궎吏� : 紐⑤몢 �냼臾몄옄濡� �옉�꽦
 *    2) �겢�옒�뒪 : Upper Camel Case
 *    3) 蹂��닔, 硫붿냼�뱶 : Lower Camel Case
 *    4) �긽�닔 : Snake Case
 * 2. Case
 *    1) Upper Camel Case : MyFirstName, MyLastName �벑
 *    2) Lower Camel Case : myFirstName, myLastName �벑
 *    3) Snake Case : MY_FIRST_NAME, MY_LAST_NAME �벑
 */

/*
 * 3. �옄諛� �봽濡쒖젥�듃 援ъ“
 *    project
 *      �꽩src
 *        �꽩package
 *          �꽩class
 * 4. main() 硫붿냼�뱶
 *    1) 諛섎뱶�떆 �엳�뼱�빞 �옄諛� �봽濡쒖젥�듃媛� �떎�뻾�맂�떎.
 *    2) JVM(Java Virtual Machine)�� �쁽�옱 main() 硫붿냼�뱶瑜� �떎�뻾�븯怨�,
 *       留뚯빟 �떎�뻾�뿉 �떎�뙣�븯硫�, 理쒓렐 main() 硫붿냼�뱶瑜� �떎�뻾�븳�떎.
 */

/*
 * 5. �옄諛� 肄붾뱶 �옉�꽦
 *    1) 紐⑤뱺 肄붾뱶�뒗 class(�겢�옒�뒪) �궡遺��뿉 �옉�꽦�븳�떎.
 *    2) �떎�뻾 肄붾뱶�뒗 main() 硫붿냼�뱶�뿉 �옉�꽦�븳�떎.
 *    3) ���냼臾몄옄瑜� �솗�떎�엳 援щ텇�븳�떎.
 * 6. �씠�겢由쎌뒪�쓽 �씤�뀛由ъ쟾�뒪
 *    1) 肄붾뱶瑜� �셿�꽦�빐 以��떎.
 *    2) �엯�젰�븷 �닔 �엳�뒗 肄붾뱶瑜� 蹂댁뿬以��떎.
 *    3) Ctrl + Spacebar
 */

public class Ex1_literal {

	public static void main(String[] args) {
		
		// TODO 援ы쁽�빐�빞 �맆 �궡�슜 �옉�꽦
		
		/*
		 * �씪諛� 二쇱꽍
		 */

		/**
		 * javadoc
		 * �옄諛� 臾몄꽌 留뚮뱶�뒗 二쇱꽍
		 */
		
		/*
		System.out.println();  // 異쒕젰 + 以꾨컮轅�
		System.out.print();  // 異쒕젰
		System.out.printf();  // C �룷留� �떖蹂� �샇�솚�슜  
		*/
		
		/*
		 * 由ы꽣�윺 (literal)
		 *    1) �뜲�씠�꽣瑜� �몴湲고븯�뒗 諛⑸쾿
		 *    2) �닽�옄 : 1, 1.5, 1.5E+5 �벑
		 *    3) 臾몄옄 : 'a', 'A', '�븳'
		 *    4) 臾몄옄�뿴 : "a", "Apple", "�븳援�"
		 *    5) �끉由� : true, false
		 *    6) �꼸 : null
		 */
		
		System.out.println(10);
		System.out.println(1.5);
		System.out.println(1.5555555555);
		System.out.println('a');
		System.out.println('a');
		System.out.println("Apple");
		System.out.println(true);
		System.out.println(false);
		// System.out.println(null);
		
	}  // end main
	
	// main() 硫붿냼�뱶 諛붽묑履�

}  // end class
