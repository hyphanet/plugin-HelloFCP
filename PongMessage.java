/**
 * 
 */
package plugins.HelloFCP;

import freenet.node.Node;
import freenet.node.fcp.FCPConnectionHandler;
import freenet.node.fcp.FCPMessage;
import freenet.node.fcp.MessageInvalidException;
import freenet.node.fcp.ProtocolErrorMessage;
import freenet.support.SimpleFieldSet;

/**
 * @author saces
 *
 */
public class PongMessage extends FCPMessage {
	public static String name = "Pong";

	public SimpleFieldSet getFieldSet() {
		SimpleFieldSet sfs = new SimpleFieldSet(true);
		sfs.putSingle("Hello", "FCP");
		sfs.putSingle("World", "mine!!");
		return sfs;
	}

	public String getName() {
		return name;
	}

	public void run(FCPConnectionHandler handler, Node node) throws MessageInvalidException {
		throw new MessageInvalidException(ProtocolErrorMessage.INVALID_MESSAGE, name + " goes from server to client not the other way around", name, false);
	}

}
