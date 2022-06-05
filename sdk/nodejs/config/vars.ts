// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("confluentcloud");

/**
 * The Confluent Cloud API Key.
 */
export declare const apiKey: string | undefined;
Object.defineProperty(exports, "apiKey", {
    get() {
        return __config.get("apiKey");
    },
    enumerable: true,
});

/**
 * The Confluent Cloud API Secret.
 */
export declare const apiSecret: string | undefined;
Object.defineProperty(exports, "apiSecret", {
    get() {
        return __config.get("apiSecret");
    },
    enumerable: true,
});

/**
 * The base endpoint of Confluent Cloud API.
 */
export declare const endpoint: string | undefined;
Object.defineProperty(exports, "endpoint", {
    get() {
        return __config.get("endpoint");
    },
    enumerable: true,
});

