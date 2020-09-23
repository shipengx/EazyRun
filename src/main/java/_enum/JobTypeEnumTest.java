package _enum;

import java.util.EnumSet;
import java.util.Set;

public class JobTypeEnumTest {

    enum JobType {
        MATERIALIZE_AD_HOC,
        MATERIALIZE_SCHEDULED,
        COUNT;

        private static final Set<JobType> MATERIALIZE_JOBS =
                EnumSet.of(MATERIALIZE_AD_HOC, MATERIALIZE_SCHEDULED);

        public boolean isMaterialize() {
            return MATERIALIZE_JOBS.contains(this);
        }
    }

    public static void main(String[] args) {

        JobType jobType1 = JobType.MATERIALIZE_SCHEDULED;
        System.out.println("Job type is : " + jobType1);
        System.out.println("name : " + jobType1.name());
        System.out.println("value : " + jobType1.toString());

        System.out.println();
        System.out.println();

        JobType jobType2 = JobType.MATERIALIZE_AD_HOC;
        System.out.println("Job type is : " + jobType2);
    }

}
