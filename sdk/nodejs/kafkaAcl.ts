// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import Kafka ACLs by using the Kafka cluster ID and attributes of `confluent_kafka_acl` resource in the format `<Kafka cluster ID>/<Kafka ACL resource type>#<Kafka ACL resource name>#<Kafka ACL pattern type>#<Kafka ACL principal>#<Kafka ACL host>#<Kafka ACL operation>#<Kafka ACL permission>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>" $ export KAFKA_API_KEY="<kafka_api_key>" $ export KAFKA_API_SECRET="<kafka_api_secret>" $ export KAFKA_HTTP_ENDPOINT="<kafka_http_endpoint>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/kafkaAcl:KafkaAcl describe-cluster "lkc-12345/CLUSTER#kafka-cluster#LITERAL#User:sa-xyz123#*#DESCRIBE#ALLOW"
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class KafkaAcl extends pulumi.CustomResource {
    /**
     * Get an existing KafkaAcl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KafkaAclState, opts?: pulumi.CustomResourceOptions): KafkaAcl {
        return new KafkaAcl(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/kafkaAcl:KafkaAcl';

    /**
     * Returns true if the given object is an instance of KafkaAcl.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KafkaAcl {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KafkaAcl.__pulumiType;
    }

    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.KafkaAclCredentials>;
    /**
     * The host for the ACL. Should be set to `*` for Confluent Cloud.
     */
    public readonly host!: pulumi.Output<string>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
     */
    public readonly httpEndpoint!: pulumi.Output<string>;
    public readonly kafkaCluster!: pulumi.Output<outputs.KafkaAclKafkaCluster>;
    /**
     * The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
     */
    public readonly operation!: pulumi.Output<string>;
    /**
     * The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
     */
    public readonly patternType!: pulumi.Output<string>;
    /**
     * The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
     */
    public readonly permission!: pulumi.Output<string>;
    /**
     * The principal for the ACL.
     */
    public readonly principal!: pulumi.Output<string>;
    /**
     * The resource name for the ACL.
     */
    public readonly resourceName!: pulumi.Output<string>;
    /**
     * The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
     */
    public readonly resourceType!: pulumi.Output<string>;

    /**
     * Create a KafkaAcl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KafkaAclArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KafkaAclArgs | KafkaAclState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KafkaAclState | undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["httpEndpoint"] = state ? state.httpEndpoint : undefined;
            resourceInputs["kafkaCluster"] = state ? state.kafkaCluster : undefined;
            resourceInputs["operation"] = state ? state.operation : undefined;
            resourceInputs["patternType"] = state ? state.patternType : undefined;
            resourceInputs["permission"] = state ? state.permission : undefined;
            resourceInputs["principal"] = state ? state.principal : undefined;
            resourceInputs["resourceName"] = state ? state.resourceName : undefined;
            resourceInputs["resourceType"] = state ? state.resourceType : undefined;
        } else {
            const args = argsOrState as KafkaAclArgs | undefined;
            if ((!args || args.credentials === undefined) && !opts.urn) {
                throw new Error("Missing required property 'credentials'");
            }
            if ((!args || args.host === undefined) && !opts.urn) {
                throw new Error("Missing required property 'host'");
            }
            if ((!args || args.httpEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'httpEndpoint'");
            }
            if ((!args || args.kafkaCluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kafkaCluster'");
            }
            if ((!args || args.operation === undefined) && !opts.urn) {
                throw new Error("Missing required property 'operation'");
            }
            if ((!args || args.patternType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'patternType'");
            }
            if ((!args || args.permission === undefined) && !opts.urn) {
                throw new Error("Missing required property 'permission'");
            }
            if ((!args || args.principal === undefined) && !opts.urn) {
                throw new Error("Missing required property 'principal'");
            }
            if ((!args || args.resourceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceName'");
            }
            if ((!args || args.resourceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceType'");
            }
            resourceInputs["credentials"] = args ? args.credentials : undefined;
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["httpEndpoint"] = args ? args.httpEndpoint : undefined;
            resourceInputs["kafkaCluster"] = args ? args.kafkaCluster : undefined;
            resourceInputs["operation"] = args ? args.operation : undefined;
            resourceInputs["patternType"] = args ? args.patternType : undefined;
            resourceInputs["permission"] = args ? args.permission : undefined;
            resourceInputs["principal"] = args ? args.principal : undefined;
            resourceInputs["resourceName"] = args ? args.resourceName : undefined;
            resourceInputs["resourceType"] = args ? args.resourceType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KafkaAcl.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KafkaAcl resources.
 */
export interface KafkaAclState {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.KafkaAclCredentials>;
    /**
     * The host for the ACL. Should be set to `*` for Confluent Cloud.
     */
    host?: pulumi.Input<string>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
     */
    httpEndpoint?: pulumi.Input<string>;
    kafkaCluster?: pulumi.Input<inputs.KafkaAclKafkaCluster>;
    /**
     * The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
     */
    operation?: pulumi.Input<string>;
    /**
     * The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
     */
    patternType?: pulumi.Input<string>;
    /**
     * The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
     */
    permission?: pulumi.Input<string>;
    /**
     * The principal for the ACL.
     */
    principal?: pulumi.Input<string>;
    /**
     * The resource name for the ACL.
     */
    resourceName?: pulumi.Input<string>;
    /**
     * The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
     */
    resourceType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KafkaAcl resource.
 */
export interface KafkaAclArgs {
    /**
     * The Cluster API Credentials.
     */
    credentials: pulumi.Input<inputs.KafkaAclCredentials>;
    /**
     * The host for the ACL. Should be set to `*` for Confluent Cloud.
     */
    host: pulumi.Input<string>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
     */
    httpEndpoint: pulumi.Input<string>;
    kafkaCluster: pulumi.Input<inputs.KafkaAclKafkaCluster>;
    /**
     * The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
     */
    operation: pulumi.Input<string>;
    /**
     * The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
     */
    patternType: pulumi.Input<string>;
    /**
     * The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
     */
    permission: pulumi.Input<string>;
    /**
     * The principal for the ACL.
     */
    principal: pulumi.Input<string>;
    /**
     * The resource name for the ACL.
     */
    resourceName: pulumi.Input<string>;
    /**
     * The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
     */
    resourceType: pulumi.Input<string>;
}
