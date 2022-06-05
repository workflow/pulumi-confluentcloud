// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a connector by using Environment ID, Kafka cluster ID, and connector's name, in the format `<Environment ID>/<Kafka cluster ID>/<Connector name>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/connector:Connector my_connector "env-abc123/lkc-abc123/S3_SINKConnector_0"
 * ```
 */
export class Connector extends pulumi.CustomResource {
    /**
     * Get an existing Connector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectorState, opts?: pulumi.CustomResourceOptions): Connector {
        return new Connector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/connector:Connector';

    /**
     * Returns true if the given object is an instance of Connector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connector.__pulumiType;
    }

    /**
     * The custom connector _nonsensitive_ configuration settings to set:
     */
    public readonly configNonsensitive!: pulumi.Output<{[key: string]: string}>;
    /**
     * The custom connector _sensitive_ configuration settings to set:
     */
    public readonly configSensitive!: pulumi.Output<{[key: string]: string}>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.ConnectorEnvironment>;
    public readonly kafkaCluster!: pulumi.Output<outputs.ConnectorKafkaCluster>;

    /**
     * Create a Connector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectorArgs | ConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectorState | undefined;
            resourceInputs["configNonsensitive"] = state ? state.configNonsensitive : undefined;
            resourceInputs["configSensitive"] = state ? state.configSensitive : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["kafkaCluster"] = state ? state.kafkaCluster : undefined;
        } else {
            const args = argsOrState as ConnectorArgs | undefined;
            if ((!args || args.configNonsensitive === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configNonsensitive'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.kafkaCluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kafkaCluster'");
            }
            resourceInputs["configNonsensitive"] = args ? args.configNonsensitive : undefined;
            resourceInputs["configSensitive"] = args ? args.configSensitive : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["kafkaCluster"] = args ? args.kafkaCluster : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connector resources.
 */
export interface ConnectorState {
    /**
     * The custom connector _nonsensitive_ configuration settings to set:
     */
    configNonsensitive?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The custom connector _sensitive_ configuration settings to set:
     */
    configSensitive?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.ConnectorEnvironment>;
    kafkaCluster?: pulumi.Input<inputs.ConnectorKafkaCluster>;
}

/**
 * The set of arguments for constructing a Connector resource.
 */
export interface ConnectorArgs {
    /**
     * The custom connector _nonsensitive_ configuration settings to set:
     */
    configNonsensitive: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The custom connector _sensitive_ configuration settings to set:
     */
    configSensitive?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.ConnectorEnvironment>;
    kafkaCluster: pulumi.Input<inputs.ConnectorKafkaCluster>;
}