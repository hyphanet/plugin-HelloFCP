/**
 * 
 */
package plugins.HelloFCP;

import freenet.node.fcp.FCPMessage;
import freenet.pluginmanager.FredPlugin;
import freenet.pluginmanager.FredPluginFCP;
import freenet.pluginmanager.FredPluginThreadless;
import freenet.pluginmanager.PluginRespirator;
import freenet.support.SimpleFieldSet;

/**
 * @author saces
 *
 */
public class HelloFCP implements FredPlugin, FredPluginThreadless, FredPluginFCP {

	public void runPlugin(PluginRespirator pr) {
		
	}

	public void terminate() {
		
	}

	/**
	 * sample command:
	 * <pre>
	 * plugins.HelloFCP.HelloFCP.Ping
	 * EndMessage
	 * </pre>
	 * the node have found our class (plugins.HelloFCP.HelloFCP) and want now to
	 * know what to do with "Ping"
	 * 
	 * the fullaccess flag is set true if the client comes from an adress with full fcp access,
	 * otherwise false
	 * 
	 * @see freenet.pluginmanager.FredPluginFCP#create(java.lang.String, freenet.support.SimpleFieldSet, boolean)
	 */
	public FCPMessage create(String name, SimpleFieldSet fs, boolean fullaccess) {
		if(name.equals(PingMessage.name))
			return new PingMessage(fs);
		
		return null;
	}

}
