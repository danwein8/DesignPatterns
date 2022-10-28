package Factory;

/**
 * abstract factory design pattern example, can create the tools needed to build a game world
 * @author Daniel Weiner
 *
 */
public abstract class Factory 
{
	
	public Factory() {  }
	
	public enum ProductId {
		TEXTURE, MESH;
	}
	
	public Product Create(ProductId id)
	{
		switch (id)
		{
		case TEXTURE:
			return new Texture();
		case MESH:
			return new Mesh();
		default:
			return new Product();
		}
	}
}
