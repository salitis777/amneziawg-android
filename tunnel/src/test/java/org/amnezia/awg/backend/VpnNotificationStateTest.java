package org.amnezia.awg.backend;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VpnNotificationStateTest {
    @Test
    public void handshakePromotesOnlyAConnectingTunnel() {
        assertEquals(VpnNotificationState.CONNECTED, VpnNotificationState.CONNECTING.afterHandshake());
        assertEquals(VpnNotificationState.STARTING, VpnNotificationState.STARTING.afterHandshake());
        assertEquals(VpnNotificationState.STOPPING, VpnNotificationState.STOPPING.afterHandshake());
        assertEquals(VpnNotificationState.CONNECTED, VpnNotificationState.CONNECTED.afterHandshake());
    }
}
