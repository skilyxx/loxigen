package org.projectfloodlight.openflow.protocol.match;

// MUST BE ORDERED BY THE ORDER OF OF SPEC!!!
public enum MatchFields {
    // if present, PacketType must appear as the first OXM in the list (OF 1.5., 7.2.3.11)
    PACKET_TYPE,
    IN_PORT,
    IN_PHY_PORT,
    METADATA,
    ETH_DST,
    ETH_SRC,
    ETH_TYPE,
    VLAN_VID,
    VLAN_PCP,
    IP_DSCP,
    IP_ECN,
    IP_PROTO,
    IPV4_SRC,
    IPV4_DST,
    TCP_SRC,
    TCP_DST,
    UDP_SRC,
    UDP_DST,
    SCTP_SRC,
    SCTP_DST,
    ICMPV4_TYPE,
    ICMPV4_CODE,
    ARP_OP,
    ARP_SPA,
    ARP_TPA,
    ARP_SHA,
    ARP_THA,
    IPV6_SRC,
    IPV6_DST,
    IPV6_FLABEL,
    ICMPV6_TYPE,
    ICMPV6_CODE,
    IPV6_ND_TARGET,
    IPV6_ND_SLL,
    IPV6_ND_TLL,
    MPLS_LABEL,
    MPLS_TC,
    MPLS_BOS,
    TUNNEL_ID,
    IPV6_EXTHDR,
    PBB_UCA,
    TCP_FLAGS,
    OVS_TCP_FLAGS,
    ACTSET_OUTPUT,
    TUNNEL_IPV4_SRC,
    TUNNEL_IPV4_DST,
    BSN_IN_PORTS_128,
    BSN_IN_PORTS_512,
    BSN_LAG_ID,
    BSN_VRF,
    BSN_GLOBAL_VRF_ALLOWED,
    BSN_L3_INTERFACE_CLASS_ID,
    BSN_L3_SRC_CLASS_ID,
    BSN_L3_DST_CLASS_ID,
    BSN_EGR_PORT_GROUP_ID,
    BSN_UDF0,
    BSN_UDF1,
    BSN_UDF2,
    BSN_UDF3,
    BSN_UDF4,
    BSN_UDF5,
    BSN_UDF6,
    BSN_UDF7,
    BSN_TCP_FLAGS,
    BSN_VLAN_XLATE_PORT_GROUP_ID,
    BSN_L2_CACHE_HIT,
    BSN_INGRESS_PORT_GROUP_ID,
    BSN_VXLAN_NETWORK_ID,
    BSN_INNER_ETH_DST,
    BSN_INNER_ETH_SRC,
    BSN_INNER_VLAN_VID,
    BSN_VFI,
    BSN_IP_FRAGMENTATION,
    BSN_IFP_CLASS_ID,
    CONN_TRACKING_STATE,
    CONN_TRACKING_ZONE,
    CONN_TRACKING_MARK,
    CONN_TRACKING_LABEL,
}
