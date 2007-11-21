/* This code is part of Freenet. It is distributed under the GNU General
 * Public License, version 2 (or at your option any later version). See
 * http://www.gnu.org/ for further details of the GPL. */
package plugins.HelloFCP;

import freenet.pluginmanager.FredPlugin;
import freenet.pluginmanager.FredPluginFCP;
import freenet.pluginmanager.FredPluginThreadless;
import freenet.pluginmanager.PluginReplySender;
import freenet.pluginmanager.PluginRespirator;
import freenet.support.SimpleFieldSet;
import freenet.support.api.Bucket;

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
	 * if the access flag is null it is a direct call from an other plugin
	 * the access flag is set true if the client comes from an adress with full fcp access,
	 * otherwise it is set false
	 * 
	 * @see freenet.pluginmanager.FredPluginFCP#create(java.lang.String, freenet.support.SimpleFieldSet, boolean)
	 */
	public void handle(PluginReplySender replysender, SimpleFieldSet params, Bucket data, Boolean access) {
		// simple echo
		replysender.send(params, data);
	}

}
