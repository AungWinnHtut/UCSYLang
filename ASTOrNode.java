/* Generated By:JJTree: Do not edit this line. ASTOrNode.java */

public class ASTOrNode extends ParentExpression {
	ParentExpression opOne;
	ParentExpression opTwo;
  public ASTOrNode(int id) {
    super(id);
  }

  public ASTOrNode(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}