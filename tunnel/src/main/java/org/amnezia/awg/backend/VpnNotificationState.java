package org.amnezia.awg.backend;

import org.amnezia.awg.tunnel.R;

/** Notification states for the existing AmneziaWG VPN service. */
enum VpnNotificationState {
    STARTING(R.string.awg_vpn_notification_starting),
    CONNECTING(R.string.awg_vpn_notification_connecting),
    CONNECTED(R.string.awg_vpn_notification_connected),
    STOPPING(R.string.awg_vpn_notification_stopping);

    final int textResource;

    VpnNotificationState(final int textResource) {
        this.textResource = textResource;
    }

    VpnNotificationState afterHandshake() {
        return this == CONNECTING ? CONNECTED : this;
    }
}
