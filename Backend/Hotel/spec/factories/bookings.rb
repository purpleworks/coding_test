FactoryGirl.define do
  factory :booking do
    sequence(:name) { |n| "예약 #{n}" }
    status { 'ready' }
  end
end
