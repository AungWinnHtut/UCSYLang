/* Generated By:JJTree: Do not edit this line. ASTForInitializer.java */

public class ASTForInitializer extends SimpleNode {
	ASTForInit forInit;
  public ASTForInitializer(int id) {
    super(id);
  }

  public ASTForInitializer(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}