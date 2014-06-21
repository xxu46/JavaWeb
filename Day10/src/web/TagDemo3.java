package web;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class TagDemo3 extends TagSupport {
	int x = 5;
	@Override
	public int doStartTag() throws JspException {
		return Tag.EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		
		x--;
		if(x>0){
			return IterationTag.EVAL_BODY_AGAIN;
		}else{
			return IterationTag.SKIP_BODY;
		}
		
		
		
		
		
		
	}
	
	
}
