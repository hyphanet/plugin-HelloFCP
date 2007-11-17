/**
 * 
 */
package plugins.HelloFCP;

import freenet.node.Node;
import freenet.node.fcp.FCPConnectionHandler;
import freenet.node.fcp.FCPMessage;
import freenet.node.fcp.MessageInvalidException;
import freenet.support.SimpleFieldSet;

/**
 * @author saces
 *
 */
public class PingMessage extends FCPMessage {
	public static String name = "Ping";

	public PingMessage(SimpleFieldSet fs) {
		
	}

	public SimpleFieldSet getFieldSet() {
		return null;
	}

	public String getName() {
		return name;
	}

	public void run(FCPConnectionHandler handler, Node node) throws MessageInvalidException {
		handler.outputHandler.queue(new PongMessage());	
	}

}
