/*
 * CODE,
 * CODE NUA,
 * CODE MAI...
 */
package caroserver;

import utils.Value;

/**
 *
 * @author Son Vu
 */
public class CaroServer {

	public static void main(String[] args) {
		Server server = new Server(Value.portNum);
		server.start();
	}
	
}