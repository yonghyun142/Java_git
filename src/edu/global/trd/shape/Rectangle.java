

package edu.global.trd.shape;

import edu.global.trd.shape.Printable;


class Member extends Object{

	   private String color;
	   
	   public Member(String color) {
	      this.color = color;
	   }
	   
	   @Override
	   public boolean equals(Object obj) {
	      
	      Member member = (Member) obj; // 자식 = 부모 되는 케이스트 자식 = (자식)부모 시켜서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함

	      if (color.equals(member.color))
	         return true;

	      return false;
	      
	   }
	}
