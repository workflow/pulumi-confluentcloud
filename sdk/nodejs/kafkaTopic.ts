// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Kafka topic by using the Kafka cluster ID and Kafka topic name in the format `<Kafka cluster ID>/<Kafka topic name>`, for example$ export KAFKA_API_KEY="<kafka_api_key>" $ export KAFKA_API_SECRET="<kafka_api_secret>" $ export KAFKA_HTTP_ENDPOINT="<kafka_http_endpoint>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class KafkaTopic extends pulumi.CustomResource {
    /**
     * Get an existing KafkaTopic resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KafkaTopicState, opts?: pulumi.CustomResourceOptions): KafkaTopic {
        return new KafkaTopic(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/kafkaTopic:KafkaTopic';

    /**
     * Returns true if the given object is an instance of KafkaTopic.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KafkaTopic {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KafkaTopic.__pulumiType;
    }

    /**
     * The custom topic settings to set:
     */
    public readonly config!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.KafkaTopicCredentials>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly httpEndpoint!: pulumi.Output<string>;
    public readonly kafkaCluster!: pulumi.Output<outputs.KafkaTopicKafkaCluster>;
    /**
     * The number of partitions to create in the topic. Defaults to `6`.
     */
    public readonly partitionsCount!: pulumi.Output<number | undefined>;
    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     */
    public readonly topicName!: pulumi.Output<string>;

    /**
     * Create a KafkaTopic resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KafkaTopicArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KafkaTopicArgs | KafkaTopicState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KafkaTopicState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["httpEndpoint"] = state ? state.httpEndpoint : undefined;
            resourceInputs["kafkaCluster"] = state ? state.kafkaCluster : undefined;
            resourceInputs["partitionsCount"] = state ? state.partitionsCount : undefined;
            resourceInputs["topicName"] = state ? state.topicName : undefined;
        } else {
            const args = argsOrState as KafkaTopicArgs | undefined;
            if ((!args || args.credentials === undefined) && !opts.urn) {
                throw new Error("Missing required property 'credentials'");
            }
            if ((!args || args.httpEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'httpEndpoint'");
            }
            if ((!args || args.kafkaCluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kafkaCluster'");
            }
            if ((!args || args.topicName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'topicName'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["credentials"] = args ? args.credentials : undefined;
            resourceInputs["httpEndpoint"] = args ? args.httpEndpoint : undefined;
            resourceInputs["kafkaCluster"] = args ? args.kafkaCluster : undefined;
            resourceInputs["partitionsCount"] = args ? args.partitionsCount : undefined;
            resourceInputs["topicName"] = args ? args.topicName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KafkaTopic.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KafkaTopic resources.
 */
export interface KafkaTopicState {
    /**
     * The custom topic settings to set:
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.KafkaTopicCredentials>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    httpEndpoint?: pulumi.Input<string>;
    kafkaCluster?: pulumi.Input<inputs.KafkaTopicKafkaCluster>;
    /**
     * The number of partitions to create in the topic. Defaults to `6`.
     */
    partitionsCount?: pulumi.Input<number>;
    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     */
    topicName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KafkaTopic resource.
 */
export interface KafkaTopicArgs {
    /**
     * The custom topic settings to set:
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Cluster API Credentials.
     */
    credentials: pulumi.Input<inputs.KafkaTopicCredentials>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    httpEndpoint: pulumi.Input<string>;
    kafkaCluster: pulumi.Input<inputs.KafkaTopicKafkaCluster>;
    /**
     * The number of partitions to create in the topic. Defaults to `6`.
     */
    partitionsCount?: pulumi.Input<number>;
    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     */
    topicName: pulumi.Input<string>;
}
