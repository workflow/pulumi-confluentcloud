// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `confluentcloud.getOrganization` describes an Organization data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleOrganization = confluentcloud.getOrganization({});
 * export const example = exampleOrganization;
 * ```
 */
export function getOrganization(opts?: pulumi.InvokeOptions): Promise<GetOrganizationResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("confluentcloud:index/getOrganization:getOrganization", {
    }, opts);
}

/**
 * A collection of values returned by getOrganization.
 */
export interface GetOrganizationResult {
    /**
     * (Required String) The ID of the Organization, for example, `1111aaaa-11aa-11aa-11aa-111111aaaaaa`.
     */
    readonly id: string;
    /**
     * (Required String) The Confluent Resource Name of the Organization, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa`.
     */
    readonly resourceName: string;
}
