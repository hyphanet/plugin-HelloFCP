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

	public FCPMessage create(String name, SimpleFieldSet fs) {
		if(name.equals(PingMessage.name))
			return new PingMessage(fs);
		
		return null;
	}

}
