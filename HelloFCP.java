/* This code is part of Freenet. It is distributed under the GNU General
 * Public License, version 2 (or at your option any later version). See
 * http://www.gnu.org/ for further details of the GPL. */
package plugins.HelloFCP;

import freenet.pluginmanager.FCPPluginOutputWrapper;
import freenet.pluginmanager.FredPlugin;
import freenet.pluginmanager.FredPluginFCP;
import freenet.pluginmanager.FredPluginThreadless;
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
	 * 
	 * the fullaccess flag is set true if the client comes from an adress with full fcp access,
	 * otherwise false
	 * 
	 * @see freenet.pluginmanager.FredPluginFCP#create(java.lang.String, freenet.support.SimpleFieldSet, boolean)
	 */
	public void handle(FCPPluginOutputWrapper replysender, SimpleFieldSet params, Bucket data, boolean fullacess) {
		// simple echo
		replysender.send(params, data);
	}

}
