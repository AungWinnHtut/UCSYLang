/* Generated By:JJTree: Do not edit this line. ASTClassDeclaration.java */

public class ASTClassDeclaration extends ParentTypeDeclaration
{

	ASTClassHeader classHeader;
	ASTClassBody   classBody;
	
 	UCSYClass theClass = new UCSYClass();
  
  public ASTClassDeclaration(int id) {
    super(id);
  }

  public ASTClassDeclaration(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}